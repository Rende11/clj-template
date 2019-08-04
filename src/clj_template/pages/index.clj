(ns clj-template.pages.index
  (:use [hiccup.core]))

(defn index [req]
  [:div
   [:h1 "Hello from Clojure App !"]])
