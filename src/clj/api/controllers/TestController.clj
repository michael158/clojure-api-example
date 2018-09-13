(ns api.controllers.TestController
    (:use ring.util.response)
    (:require [api.helpers.helpers :as helpers])
    (:require [api.model.test :as test])
    (:require [api.layout :as layout]))

(defn index []
      (def age 25)
      (def name "Jubilindo")
      (layout/render "test/index.html" {:name name :last_name "Douglas" :data {:age age}}))

(defn show [id]
      (response (test/find id)))

(defn create [data]
      (response (test/create data)))

(defn jsonReturnExample []
      (response {:from "Clojure" :message "This is a return json example"}))