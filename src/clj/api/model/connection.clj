(ns api.model.connection
    (:require [clojure.java.jdbc :as jdbc]))


(def mysql-connection {:dbtype "mysql"
                      :dbname "clojure-api"
                      :host "localhost"
                      :user "root"
                      :password ""})

(defn insert [table data]
      :return (jdbc/insert! mysql-connection table data))

(defn find [table id]
      (def query (str "SELECT * FROM " table " WHERE id = ?"))
      (def dataReturn (jdbc/query mysql-connection [query id]))
      :return dataReturn)
