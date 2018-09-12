(ns api.model.abstractmodel (:require [api.model.connection :as connection]))

(defn create [table data]
      (connection/insert table data))