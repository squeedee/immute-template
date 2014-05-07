(ns leiningen.new.immute
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files]]
            [leiningen.core.main :as main]))

(def render (renderer "immute"))

(defn immute
  "FIXME: write documentation"
  [name]
  (let [data {:name name
              :sanitized (name-to-path name)}]
    (main/info "Generating fresh 'lein new' immute project.")
    (->files data
             ["README.md" (render "README.md" data)])))
