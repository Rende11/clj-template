(ns clj-template.routes
  (:require [clj-template.pages.index :refer [index]]
            [clj-template.pages.features :refer [features]]
            [clj-template.pages.layout :refer [application]]))

(def routes
  {:GET       #'index
   "features" {:GET  #'features
               [:id] {:GET "hello"}}})
