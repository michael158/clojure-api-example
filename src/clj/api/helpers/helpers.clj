(ns api.helpers.helpers
    (:use ring.util.response))

(defn dd [data]
      (status (response data) 500))
