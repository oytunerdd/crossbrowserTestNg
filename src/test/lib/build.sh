hub="java -jar selenium-server-standalone-3.141.59.jar -role hub -hubConfig hubConfig.json -debug"
node="java -jar selenium-server-standalone-3.141.59.jar -role node -nodeConfig nodeConfig.json"

${hub} &
echo '3'
sleep 1
echo '2'
sleep 1
echo '1'
sleep 1
echo 'registering drivers'
${node} &


