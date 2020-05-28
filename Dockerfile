# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.
FROM psharkey/netbeans-8.1:latest

MAINTAINER DevOps "fabriciotm@hotmail.com"

COPY target/PruebaDevOps-1.0-SNAPSHOT.war /

EXPOSE 80