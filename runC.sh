set -e
if [ "$1" = "" ]
then
  echo "No program specified, exiting..."
  exit
fi
name=`grep NAME $1 | cut -d " " -f 3`
gcc -std=c99 -o compiled_$name $1
./compiled_$name
