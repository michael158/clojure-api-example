(ns api.controllers.TestController
    (:use ring.util.response)
    (:require [api.layout :as layout]))

(defn index []
      (def age 25)
      (def name "Jubilindo")
      (layout/render "test/index.html" {:name name :last_name "Douglas" :data {:age age}}))

(defn show [id]
      (layout/render "test/show.html" {:id id}))


(defn jsonReturnExample []
      (response {:from "Clojure" :message "This is a return json example"}))