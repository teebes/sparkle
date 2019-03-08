(ns sparkle.views
  (:require
   [re-frame.core :as re-frame]
   [sparkle.subs :as subs]
   ))

(defn main-panel []
  (let [name (re-frame/subscribe [::subs/name])]
    [:div
     [:h1 "Hello from " @name]
     [:div "Just another div"]
     ]
     ))
