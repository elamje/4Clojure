(ns thirtythree)

;; replicate each element
(= ((fn replicater [coll n] (mapcat #(repeat n %) coll)) [1 2 3] 2) '(1 1 2 2 3 3))
;; => true

(fn replicater [coll n] (mapcat #(repeat n %) coll))
