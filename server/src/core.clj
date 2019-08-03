(ns server.core
  (:require
   [route-map.core :as router]
   [org.httpkit.server :as http]))

(defn index [req]
  {:body "HELLO INDEX"})

(defn hello [req]
  {:body "TEST"})

(def routes
  {:GET    index
   "hello" {:GET hello}})


(defn app [{method :request-method uri :uri :as req}]
  (if-let [res (router/match [method uri] routes)]
    ((:match res) (update req :params merge (:params res)))
    {:status 404 :body "Not found"}))


(defonce server (atom nil))

(defn stop-server []
  (when-not (nil? @server)
    (reset! server nil)))


(defn run-server [& args]
  (reset! server (http/run-server #'app {:port 8080})))


(comment
  (run-server)
  (stop-server))
