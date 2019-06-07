(ns fortynine)

(defn foo [n coll] [(take n coll) (drop n coll)])

(= (foo 3 [1 2 3 4 5 6]) [[1 2 3 ] [4 5 6]])
