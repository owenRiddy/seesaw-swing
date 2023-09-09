#!/bin/sh

java -cp `lein classpath` lazytest.main test
