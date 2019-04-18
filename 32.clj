(ns thirtytwo)

(= (mapcat #(repeat 2 %) [1 2 3]) '(1 1 2 2 3 3))
;; => true

