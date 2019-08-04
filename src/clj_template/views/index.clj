(ns clj-template.views.index
  (:use [hiccup.core]))

(defn index [req]
  [:div
   [:h1 "Hello from Clojure App !"]
   [:div
    "A simple primary alert - check it out!"]])
