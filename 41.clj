(ns fortyone)

(= ((fn foo [coll n] (filter #(not= (mod (inc (.indexOf coll %)) n) 0) coll)) [1 2 3 4 5 6 7 8] 3) [1 2 4 5 7 8])

;; drop every nth item
(fn foo [coll n] (filter #(not= (mod (inc (.indexOf coll %)) n) 0) coll))
