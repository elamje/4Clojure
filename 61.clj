(ns sixtyone.clj)


(defn zipper 
  [coll coll2]
  (loop [map {}
         ks (seq coll)
         vs (seq coll2)]
    (if (and ks vs)
      (recur (assoc map (first ks) (first vs))
             (next ks)
             (next vs))
      map)))

(defn zipshort
  [coll coll2]
  (apply hash-map (interleave coll1 coll2)))

(= (zipper [:a :b :c] [1 2 3]) {:a 1, :b 2, :c 3})
