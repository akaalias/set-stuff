(ns set-stuff.utils)

(defn remove-non-alpha-numeric [s]
  (re-find #"[0-9a-zA-Z]+" s))
