(ns clj-template.routes
  (:require [clj-template.routes.index :refer [index]]
            [clj-template.routes.features :refer [features]]
            [clj-template.routes.layout :refer [application]]))

(def routes
  {:GET       #'index
   "features" {:GET  #'features
               [:id] {:GET "hello"}}})
