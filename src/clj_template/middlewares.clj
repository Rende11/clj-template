(ns clj-template.middlewares
  (:require [route-map.core :as router]
            [clojure.string :as string]
            [clj-template.pages.layout :as layout]
            [clj-template.routes :as routes]))


(defn logging [req & keys]
  (let [{:keys [uri query-string body request-method params]} req]
    (prn (str "[INFO] request " request-method " " uri query-string
              (when params " params: " params)))
    (prn "------------------------------------------------")
    req))



(defn routing [{method :request-method uri :uri :as req}]
  (when-let [match (router/match [method uri] routes/routes)]
    (let [params (update req :params merge (:params match))]
      {:content ((:match match) params)
       :params params})))


(defn wrap-response [{:keys [content params]}]
  (if content
    {:status 200
     :content-type "text/html"
     :body (layout/application content params)}
    {:status 404 :body "Not found"}))


