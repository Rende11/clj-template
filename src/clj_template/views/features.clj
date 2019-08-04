(ns clj-template.views.features
  (:use [hiccup.core]))


(defn features [req]
  [:div
   [:h1 "Features from Clojure App !"]
   [:div
    "A simple primary alert - check it out!"]])
