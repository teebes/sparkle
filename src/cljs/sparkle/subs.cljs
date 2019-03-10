(ns sparkle.subs
  (:require
   [re-frame.core :as re-frame]))

(re-frame/reg-sub
 ::name
 (fn [db]
   (:name db)))

; ===== Chest Formatting =====

; Format contents of the chest to be ready to be viewed
(defn extract-item 
  "returns items that formatted like a chest item or nil if they do not conform"
  [s]
  (second (re-find #"^\d+\.\s(.*)" s))
)

; transforms "1. a thing\na non-thing\n2. another thing" into
; "a thing"
; "another thing"
(defn chest-items
  "takes raw input and returns list of items that look like chest items"
  [raw-input]
  (filter
    boolean
    (map extract-item (clojure.string/split-lines raw-input))))

; transforms ["a thing" "a thing" "another thing"] into
; {"a thing" 2 "another thing" 1}
(defn index-chest-data
  [raw-data]
  (frequencies (chest-items raw-data)))

; build catalog index
(defn make-catalog-index [catalog] 
    (into (hash-map) (for [
            [cat-name items] catalog
            item items
        ]
        [item cat-name]
    ))
)

; generate flat [name count cat] list
(defn make-chest-list [chest-index, catalog-index] 
    (for [item (keys chest-index)]
        (conj [] 
              item 
              (get chest-index item) 
              (get catalog-index item "MISC"))
    )
)

; group the entries by category
(defn make-groups [entries]
    (let 
        [grouped (group-by #(get % 2) entries)]
        (for 
            [k (keys grouped)]
            [k (get grouped k)])
        )
)

(defn transform-items [catalog chest-index] 
    (let [order (map first catalog)
          f (fn [a b] (compare (.indexOf order (first a))
                       (.indexOf order (first b))))
          group (make-groups
                  (make-chest-list 
                      chest-index
                      (make-catalog-index catalog)))
          sorted (sort f group)
          ]
          sorted))

(re-frame/reg-sub
  ::chest-processed
  (fn [db]
    (let [chest-index (index-chest-data (:chest-contents db))
          catalog (:catalog db)] 
      (transform-items catalog chest-index))))

; Raw data sub

(re-frame/reg-sub
  ::chest-contents
  (fn [db]
    (:chest-contents db)
  ))