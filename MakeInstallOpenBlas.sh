#!/bin/bash
# Install OpenBLAS
# Tested on Amazon Linux AMI 2016.09 4.4.19-29.55.amzn1.x86_64

set -e
set -x

sudo yum install -y git

cd /tmp/
[ ! -d OpenBlas ] || rm -rf OpenBLAS
git clone https://github.com/xianyi/OpenBLAS.git && cd OpenBLAS

if [ $(cat /proc/cpuinfo|grep processor|wc -l) -eq 1 ]; then
  make NO_AFFINITY=1 USE_OPENMP=0 USE_THREAD=0
else
  make NO_AFFINITY=1 USE_OPENMP=1
fi

sudo make install

