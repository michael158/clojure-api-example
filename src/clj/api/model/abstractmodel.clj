(ns api.model.abstractmodel (:require [api.model.connection :as connection]))

(defn create [table data]
      :return (connection/insert table data))

(defn find [table id]
      :return (connection/find table id))