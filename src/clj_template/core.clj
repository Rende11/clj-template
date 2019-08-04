(ns clj-template.core
  (:require
   [clj-template.middlewares :as mw]
   [org.httpkit.server :as http]))


(defn app [req]
  (-> req
      mw/logging
      mw/routing
      mw/wrap-response))


(defonce server (atom nil))

(defn stop-server []
  (when-not (nil? @server)
    (reset! server nil)))


(defn run-server [& args]
  (reset! server (http/run-server #'app {:port 8080})))

(comment
  (run-server)
  (stop-server))
