(ns clj-template.routes
  (:require [clj-template.views.index :refer [index]]
            [clj-template.views.features :refer [features]]
            [clj-template.views.layout :refer [application]]))

(def routes
  {:GET       #'index
   "features" {:GET  #'features
               [:id] {:GET "hello"}}})
