(ns forty)

(= ((fn ipose [k coll] (take (dec (* (count coll) 2)) (interleave coll (repeat (count coll) k)))) 0 [1 2 3]) [1 0 2 0 3])
;; => true

;; interpose
(fn ipose [k coll] (take (dec (* (count coll) 2)) (interleave coll (repeat (count coll) k))))

;; or ozan
(fn pose [k coll] (drop-last (interleave coll (repeat k))))
