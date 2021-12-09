job('demo') {
    
    
    authorization {
        permission('hudson.model.Item.Workspace:authenticated')
    }

    steps {
        shell('echo Hello World!')
    }
}
