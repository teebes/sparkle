(ns sparkle.events
  (:require
   [re-frame.core :as re-frame]
   [sparkle.db :as db]
   ))

(re-frame/reg-event-db
 ::initialize-db
 (fn [_ _]
   db/default-db))

(re-frame/reg-event-db
  :change-chest-contents
  (fn [db [_ chest-contents]]
    (assoc db :chest-contents chest-contents)
  ))