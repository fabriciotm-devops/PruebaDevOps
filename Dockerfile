# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.
FROM shinyay/docker-glassfish5

COPY ./target/PruebaDevOps-1.0-SNAPSHOT.war ${GLASSFISH_HOME}/glassfish/domains/domain1/autodeploy

EXPOSE 8080