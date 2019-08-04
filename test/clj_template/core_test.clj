(ns clj-template.core-test
  (:require
   [clojure.test :refer :all]
   [matcho.core :as matcho]
   [clj-template.core :as core]
   [ring.mock.request :as mock]))

(deftest routes

  (matcho/assert
   {:status 200
    :body not-empty}
   (core/app (mock/request :get "/")))

  (matcho/assert
   {:status 200
    :body not-empty}
   (core/app (mock/request :get "/features"))))
