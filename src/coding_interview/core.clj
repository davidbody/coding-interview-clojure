(ns coding-interview.core)

(defn remove-extra-consecutive
  [s max-consecutive-chars]
  "Return another string that is similar to the input string, but with certain characters removed. It's going to remove characters from consecutive runs of the same character, where the length of the run is greater than the input parameter."
  (->> (partition-by char s)
       (mapcat #(take max-consecutive-chars %))
       (apply str)))
