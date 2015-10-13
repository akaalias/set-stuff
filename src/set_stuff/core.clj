(ns set-stuff.core)

(require '[clojure.java.io :as io]
         '[clojure.edn :as edn]
         '[clojure.set :as set])

(defn read-file [f]
  (try 
    (->> f
         io/resource 
         slurp 
         edn/read-string)
    (catch IllegalArgumentException e ())))

(defn intersection-files [a b]
  (let [file-a-contents (read-file a)
        file-b-contents (read-file b)]
    (set/intersection (set file-a-contents)
                      (set file-b-contents))))

(defn count-file-contents [file-name]
  (count (read-file file-name)))
