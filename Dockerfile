# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.
FROM airhacks/payara-configured

ADD target/PruebaDevOps-1.0-SNAPSHOT.war ${DEPLOYMENT_DIR}