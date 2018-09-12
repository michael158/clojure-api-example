(ns api.model.test (:require [api.model.abstractmodel :as model]))

(def table :test)

(defn create [data]
      (model/create table data))