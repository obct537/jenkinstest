import groovy.json.JsonOutput
import com.cloudbees.plugins.credentials.*

def upload(creds) {
    def pw = creds.split(':')[1]
    
    StandardCredentials c = CredentialsMatchers.firstOrNull(
        CredentialsProvider.listCredentials(
            StandardCredentials.class,
            job,
            job instanceof Queue.Task
                ? Tasks.getAuthenticationOf((Queue.Task)job))
                : ACL.SYSTEM,
            URIRequirementBuilder.fromUri(issueTrackerUrl)
        ),
        CredentialsMatchers.allOf(
            CredentialsMatchers.withId(credentialsId),
            AuthenticationTokens.matcher(IssueTrackerAuthentication.class)
        )
    );

    //sh command

}

return this