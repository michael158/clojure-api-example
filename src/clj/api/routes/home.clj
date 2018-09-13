(ns api.routes.home
  (:require [api.layout :as layout]
            [api.controllers.TestController :as TestController]
            [compojure.core :refer [defroutes GET POST PUT DELETE]]
            [ring.util.http-response :as response]
            [clojure.java.io :as io]))

(defn home-page []
  (layout/render
    "home.html" {:docs (-> "docs/docs.md" io/resource slurp)}))

(defn about-page []
  (layout/render "about.html"))

(defroutes home-routes
  (GET "/"              []               (home-page))
  (GET "/about"         []               (about-page))
  (GET "/test"          []               (TestController/index))
  (POST "/test"         {params :params} (TestController/create params))
  (GET "/test/:id"      [id]             (TestController/show id))
  (GET "/json-example"  []               (TestController/jsonReturnExample)))

