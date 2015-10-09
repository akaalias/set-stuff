(ns set-stuff.core)

(require '[clojure.java.io :as io]
         '[clojure.edn :as edn]
         '[clojure.set :as set])

;; File format: (1 2 3 ...)
(defn read-file [f]
  (->> f
       io/resource 
       slurp 
       edn/read-string))

(defn intersection-files [a b]
  (try 
    (let [file-a-contents (read-file a)
          file-b-contents (read-file b)]
      (set/intersection (set file-a-contents)
                        (set file-b-contents)))
    (catch IllegalArgumentException e #{})))
