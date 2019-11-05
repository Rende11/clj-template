(ns clj-template.core
  (:gen-class)
  (:require
   [clj-template.middlewares :as mw]
   [clojure.string :as string]
   [org.httpkit.server :as http]))

(defn get-env [value]
  (-> value
      name
      string/upper-case
      (string/replace "-" "_")
      System/getenv))


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
  (let [port (Integer/parseInt (get-env :port))]
    (reset! server (http/run-server #'app {:port port}))
    (println (str "Server launched at port " port))))

(comment
  (-main)
  (stop-server))
