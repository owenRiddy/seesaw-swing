;  Copyright (c) Dave Ray, 2011. All rights reserved.

;   The use and distribution terms for this software are covered by the
;   Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
;   which can be found in the file epl-v10.html at the root of this 
;   distribution.
;   By using this software in any fashion, you are agreeing to be bound by
;   the terms of this license.
;   You must not remove this notice, or any other, from this software.

(ns seesaw.test.rsyntax
  (:require [seesaw.rsyntax :as rsyntax]
            [seesaw.core :as core])
  (:use [lazytest.describe :only (describe it testing)]
        [lazytest.expect :only (expect)]))

(describe text-area
          (it "creates a text area"
              (let [ta (rsyntax/text-area :syntax :clojure)]
                (expect (instance? org.fife.ui.rsyntaxtextarea.RSyntaxTextArea ta))
                (expect (= "text/clojure" (core/config ta :syntax))))))

