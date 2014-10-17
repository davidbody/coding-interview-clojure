(ns coding-interview.core)

(defn remove-extra-consecutive
  [s max-consecutive-chars]
  (apply str (flatten (map (partial take max-consecutive-chars) (partition-by char s)))))
