(ns user
  (:require [api.config :refer [env]]
            [clojure.spec.alpha :as s]
            [expound.alpha :as expound]
            [mount.core :as mount]
            [api.core :refer [start-app]]))

(alter-var-root #'s/*explain-out* (constantly expound/printer))

(defn start []
  (mount/start-without #'api.core/repl-server))

(defn stop []
  (mount/stop-except #'api.core/repl-server))

(defn restart []
  (stop)
  (start))


