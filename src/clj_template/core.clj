(ns clj-template.core
  (:gen-class)
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

(defn -main [& args]
  (reset! server (http/run-server #'app {:port 8080}))
  (println "Server launched at port 8080"))

(comment
  (-main)
  (stop-server))
