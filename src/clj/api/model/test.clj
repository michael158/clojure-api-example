(ns api.model.test (:require [api.model.abstractmodel :as model]))

(def table "test")

(defn create [data]
      :return (model/create table data))

(defn find [id]
      :return (model/find table id))

(defn delete [id]
      :return (model/delete table id))