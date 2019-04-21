(ns twentynine)

(= ((fn [x] (apply str (into [] (filter #(Character/isUpperCase %) x)))) "HeLlO, WoRlD!") "HLOWRD")
;; => true

;; Filter UpperCase
(fn [x] (apply str (into [] (filter #(Character/isUpperCase %) x))))
