(ns fifty)

(defn fil [coll]
  (filter not-empty [(filter string? coll)
                     (filter vector? coll)
                     (filter keyword? coll)
                     (filter number? coll)]))

(= (set (fil [:a "foo" "bar" :b [1 2] [2 3] 3 4 5])) #{[:a :b] ["foo" "bar"] [[1 2] [2 3]] [3 4 5]})

