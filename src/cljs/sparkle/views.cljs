(ns sparkle.views
  (:require
   [re-frame.core :as re-frame]
   [sparkle.subs :as subs]
   ))

(defn chest-input
  []
  [:textarea.chest-input 
    {
     :placeholder "Enter chest contents here"
     :value @(re-frame/subscribe [::subs/chest-contents])
     :on-change #(re-frame/dispatch [:change-chest-contents (-> % .-target .-value)])
    }]
)

(defn chest-contents []
  (let [chest-data @(re-frame/subscribe [::subs/chest-processed])]
    [:div.chest-contents 
      (for 
        [cat-data chest-data] 
        ^{:key (first cat-data)}
          [:div.category
            [:h2 (first cat-data)]
            [:div.category-items 
              (for [[item-name item-count] (second cat-data)]
              ^{:key item-name}
              [:p "[" item-count "] " item-name])
            ]
          ]
      )
    ]))


(defn main-panel []
  (let [name (re-frame/subscribe [::subs/name])]
  ;  [:h1 "Hello from " @name]
    [:div
     [:h1 "Sparkle"]
     [:div.contents
      [chest-input]
      [chest-contents]]]))
