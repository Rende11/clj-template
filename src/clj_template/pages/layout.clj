(ns clj-template.pages.layout
  (:require [clojure.string :as string])
  (:use [hiccup.page :only (html5 include-css include-js)]))

(defn navbar [params]
  (let [current-page (get params :uri)
        base-routes  [{:link  "/"
                       :title "Home"}
                      {:link  "/features"
                       :title "Features"}]
        routes (map #(if (= current-page (:link %))
                       (update % :css-classes conj "active") %) base-routes)]

    [:nav.navbar.navbar-expand-lg.navbar-light.bg-light
     [:div#navbarNav.collapse.navbar-collapse.justify-content-md-center
      [:ul.navbar-nav
       (for [{:keys [link title css-classes]} routes]
         [:li.nav-item [:a.nav-link {:href  link
                                     :class (string/join "." css-classes)} title]])]]]))

(defn application [content params]
  (html5
   [:head
    [:title "title"]
    [:meta {:charset "utf-8"}]
    (include-css "https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css")
    [:body
     (navbar params)
     [:div {:class "container"}
      content]]]))
