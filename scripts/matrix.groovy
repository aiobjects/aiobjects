job('demo') {
   
    
    authorization {
        permission('hudson.model.Item.Workspace:authenticated')
        permission('hudson.model.Item.Discover', 'anonymous')
        permissions('myUserOrGroup', [
                'hudson.model.Item.Build',
                'hudson.model.Item.Discover',
                'hudson.model.Item.Cancel'
        ])
    }

    steps {
        shell('echo Hello World!')
    }
}
