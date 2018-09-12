(ns api.model.connection
    (:require [clojure.java.jdbc :as jdbc]))


(def mysql-connection {:dbtype "mysql"
                      :dbname "clojure-api"
                      :host "localhost"
                      :user "root"
                      :password ""})

(defn insert [table data]
      (jdbc/insert! mysql-connection table data))
