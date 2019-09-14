(ns eightyone)

(= (inter #{0 1 2 3} #{2 3 4 5}) #{2 3})

(defn inter 
  [s1 s2]
  (as-> #(not (contains? s2 %)) $
    (remove $ s1)
    (into #{} $)))
