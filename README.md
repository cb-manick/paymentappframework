# paymentappframework

# **Create app**


    fn create app paymentappstripe

# Deploy

     fn --verbose deploy --app paymentappstripe --local

# Invoke

    fn invoke paymentappstripe paymentappframework

# Build 

    fn build

#Inspect - Invocation endpoint
    fn inspect function paymentappstripe paymentappframework

#Invoke using curl

    curl -X POST http://localhost:8080/t/paymentappstripe/paymentappframework