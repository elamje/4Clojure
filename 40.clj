(ns forty)

;; interpose
#(take (dec (count %2)) (interleave %2 (repeat %1 (dec (count %2)))))sh
